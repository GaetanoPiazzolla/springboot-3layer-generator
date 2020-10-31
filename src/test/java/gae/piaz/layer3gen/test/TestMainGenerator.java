package gae.piaz.layer3gen.test;


import freemarker.template.TemplateException;
import gae.piaz.layer3gen.CodeGenerator;
import gae.piaz.layer3gen.config.CodeGeneratorConfig;
import org.junit.Test;

import java.io.IOException;

public class TestMainGenerator {


    @Test
    public void testGeneration() throws IOException, TemplateException {

        CodeGeneratorConfig config = CodeGeneratorConfig.load("3layer-settings.yml");
        CodeGenerator.runMain(config);

    }

}
