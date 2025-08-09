package asset.spy.statistics.service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Asset spy statistics service API",
        description = "Rest API statistics service", version = "1.0.0"))
public class AssetSpyStatisticsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssetSpyStatisticsServiceApplication.class, args);
    }
}
