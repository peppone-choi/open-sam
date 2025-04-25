package member;


import com.pepponechoi.opensam.config.MinimalSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
@Import({MinimalSecurityConfig.class})
public class PlaceApplication {
    public static void main(String[] args) {
        PlaceApplication.run(MemberApplication.class, args);
    }
}
