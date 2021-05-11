package manas.rd;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeController {
	
	@Value("${myApp.test2}")
	private String configPropString;
	
	@Value("${microsrviceSpecificMsg}")
	private String microsrviceSpecificMsg;
	
	@GetMapping("/welcome")
	public String welcome() {
		return configPropString +" : "+microsrviceSpecificMsg;
	}

}
