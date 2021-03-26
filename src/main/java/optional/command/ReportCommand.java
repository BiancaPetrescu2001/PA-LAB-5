package optional.command;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import optional.catalog.Catalog;


import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class ReportCommand extends Command {
    public ReportCommand(String commandName) {
        super("report");
    }

    public static final Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);

    public ReportCommand() {
        super("report");
    }

    public static void configureFreeMarker() throws IOException {
        //cfg.setDirectoryForTemplateLoading(new File("C:\\Users\\Utilizator\\IdeaProjects\\PA_lab_5\\templates"));
        ClassTemplateLoader loader = new ClassTemplateLoader(
                new ReportCommand().getClass(), "/ftl");
        //cfg.setTemplateLoader(new File(System.getProperty("user.dir") + "\\templates\\"));
        cfg.setTemplateLoader(loader);
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
    }

    private Map<String, Object> createDataModel(Catalog catalog) {
        Map<String, Object> root = new HashMap<>();
        root.put("catalogName", catalog.getName());
        root.put("catalogPath", catalog.getPath());
        root.put("itemsList", catalog.getItems());

        return root;
    }

    public void run() throws IOException, TemplateException {
        Map<String,Object> root = createDataModel(Catalog.listOfCatalogs.get(0));
        Template temp = ReportCommand.cfg.getTemplate("Catalog.ftl");
        Writer out = new OutputStreamWriter(System.out);
        temp.process(root, out);

    }


}
