package com.osttra.fx.blockstream;

import com.osttra.fx.blockstream.ServicebosApp;
import com.osttra.fx.blockstream.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = ServicebosApp.class)
@EmbeddedMongo
public @interface IntegrationTest {
}
