package demo.hello;

import org.nutz.lang.Strings;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

@Ok("json")
public class HelloWorld {
    @At
    public String say() {
        return "Hello world";
    }

    @At("/yousay")
    public String sayMore(@Param("username") String username,
                          @Param("age") String age ) {
        if (Strings.isBlank(username))
            return say();
        String str="{'username':'" + username +"','age':'"+age+"','append':'nuzamAppend'}";
        return str;
    }
}