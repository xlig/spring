package cn.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abel_xu on 2018/3/5.
 */
@RestController
@RefreshScope
//@ConfigurationProperties(prefix = "wordConfig")
public class ClientController {


        @Value("${content}")
        String luckyWord;

        @RequestMapping("/lucky-word")
        public String showLuckyWord() {
            return "The lucky word is2: " + luckyWord;
        }

     /*   public String getLuckyWord() {
            return luckyWord;
        }

        public void setLuckyWord(String luckyWord) {
            this.luckyWord = luckyWord;
        }*/

}
