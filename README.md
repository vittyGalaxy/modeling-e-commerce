Modellare un e-commerce utilizzando la programmazione ad oggetti.

Le entità previste sono:

- ruolo: rappresenta il ruolo che ha l'utente all'interno dell'e-commerce. I ruoli previsti sono: amministratore di sistema, cliente, responsabile catalogo, contabile, responsabile magazzino

- utente: rappresenta l'utente che accede all'e-commerce e deve contenere tutti i dati anagrafici e di autenticazione dell'utente. Un utente deve avere un ruolo.

- telefono utente: rappresenta un numero di telefono dell'utente. Un utente può avere più numeri di telefono.

- indirizzo utente: rappresenta un indirizzo fisico dell'utente (via, cap, città,...). Un utente può avere più indirizzi. Per ciascun indirizzo è necessario specificare il tipo che può essere: "indirizzo di spedizione", "indirizzo di fatturazione"

- categoria di prodotto: rappresenta una categoria merceologica. Una categoria merceologica può avere altre sotto-categorie.

- articolo: rappresenta un articolo venduto tramite l'e-commerce. Un articolo deve appartenere ad una categoria di prodotto.

- ordine di vendita: rappresenta un ordine effettuato da un cliente. Ad ogni ordine è necessario associare un indirizzo di spedizione ed uno di fatturazione. Un ordine di vendita deve avere uno stato, a scelta tra: "CREATO", "PAGATO", "SPEDITO", "CONSEGNATO". Un ordine di vendita deve avere una modalità di pagamento a scelta tra: Bonifico Bancario, Carta di credito, Paypal. Il sistema deve prevedere la possibilità di aggiungere nuove modalità di pagamento.

- riga ordine di vendita: rappresenta l'i-esima riga dell'ordine. Ogni riga deve contenere i riferimenti dell'articolo, il prezzo unitario, la quantità, lo sconto, l'IVA

Per ogni cliente deve essere possibile visualizzare la lista degli ordini effettuati.


## package
package com.vittorio.ecommerce;

## MAVEN
```
mvn validate         # verifica che il pom.xml sia valido
mvn compile          # compila il codice sorgente (src/main)
mvn test-compile     # compila anche i test (src/test)
mvn package          # compila + testa + crea il .jar in target/
mvn install          # come package, ma installa il .jar nel repository locale (~/.m2)
mvn clean            # cancella la cartella target/
mvn clean package    # pulizia + build completa (il più usato)

mvn test                          # esegue tutti i test
mvn test -Dtest=ProductTest       # esegue solo una classe
mvn test -Dtest=ProductTest#negativePrice_shouldThrowException  # solo un metodo
mvn test -DskipTests=false        # forza l'esecuzione anche se skippati
mvn package -DskipTests           # builda senza eseguire i test
```
