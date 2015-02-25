package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        String message = System.getenv("POWERED_BY");

        if (message == null) {
            message = "OpenShift";
        }

        renderText("Powered by Dei ... heu ..." + message);
    }

}

