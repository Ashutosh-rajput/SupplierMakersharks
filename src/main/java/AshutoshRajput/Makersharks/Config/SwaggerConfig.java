package AshutoshRajput.Makersharks.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi Allapi() {
        return GroupedOpenApi.builder()
                .group("All Supplier-api")
                .pathsToMatch("/**")
                .build();
    }
    @Bean
    public GroupedOpenApi SupplierSearch() {
        return GroupedOpenApi.builder()
                .group("Supplier Search-api")
                .pathsToMatch("/api/supplier/get-supplier")
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Manufacturers management Application")
                        .description("This project is developed for Makersharks by Ashutosh Rajput.\n\n" +
                                "### API Summary\n" +
                                "**Base URL:** `http://localhost:8080`\n\n" +
                                "1. **Create Supplier**\n" +
                                "   - **POST** `/api/supplier`\n" +
                                "   - Requires all fields.\n"+
                                "   - `Company` must be unique, `Website` must match a URL pattern, `Nature of Business`: `small_scale`, `medium_scale`, `large_scale`, `Manufacturing Process`: `moulding`, `3d_printing`, `casting`, `coating` \n\n" +
                                "2. **Get Supplier by ID**\n" +
                                "   - **GET** `/api/supplier/{id}`\n" +
                                "   - Retrieves a supplier by ID.\n\n" +
                                "3. **Delete Supplier by ID**\n" +
                                "   - **DELETE** `/api/supplier/{id}`\n" +
                                "   - Deletes a supplier by ID.\n\n" +
                                "4. **Search Suppliers**\n" +
                                "   - **POST** `/api/supplier/get-supplier/{page}/{size}`\n" +
                                "   - Filter by `location`, `Nature Of Business`, and `Mufacturing Process`. Values must match allowed options.\n\n" +
                                "**Database:** `MySQL` or `H2` \n" +
                                "**Note:** All fields are required and must not be null.")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Ashutosh Rajput")
                                .email("rajputashutosh81@gmail.com"))
                );
    }
}



