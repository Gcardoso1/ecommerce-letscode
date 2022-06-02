
import br.com.letscode.products.entities.Product;
import br.com.letscode.products.entities.Order;
import br.com.letscode.products.services.ProductService;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ProductListener {

    private final ProductService productService;

    public ProductListener(ProductService productService) {
        this.productService = productService;
    }

    @Transactional
    @RabbitListener(queues = "payments.products")
    public void listener(Order order) {
        for (Product product : order.getProducts()) {
            productService.update(product, 1);
        }
    }
}