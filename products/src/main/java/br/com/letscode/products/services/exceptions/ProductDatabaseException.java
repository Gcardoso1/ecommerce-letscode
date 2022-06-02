package main.java.br.com.letscode.products.services.exceptions;


public class ProductDatabaseException extends RuntimeException {

    public ProductDatabaseException(String msg) {
        super(msg);
    }

}