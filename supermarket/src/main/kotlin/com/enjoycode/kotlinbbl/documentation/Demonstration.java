package com.enjoycode.kotlinbbl.documentation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
public @interface Demonstration {
    String why() default "";
}
