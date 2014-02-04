package in.careerscale.training.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
  String value() default "";
  String key() default "";
  String condition() default "";
}
