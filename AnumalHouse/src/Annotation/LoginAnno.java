package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface AnnoLogin {
  String ExampleLogin() default ”^[a-zA-Z0-9]{1,}”+”((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*”+”@”
          +”[a-zA-Z0-9]{1,}”+”((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*”+”\\.[a-zA-Z]{2,}$”;
  }
