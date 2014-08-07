package dk.kyuff.basefx.core;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * User: swi
 * Date: 22/07/14
 * Time: 21.55
 */
@Qualifier
@Retention(RUNTIME)
@Target({TYPE, FIELD, METHOD})
public @interface FXView {
    @Nonbinding
    public String value();
}
