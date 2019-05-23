package aiss.controller2;

import aiss.model.google.drive.Files;
import aiss.model.resource.GoogleDriveResource;
import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoogleDriveFileListController extends HttpServlet {

    private static final Logger log = Logger.getLogger(GoogleDriveFileListController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String accessToken = (String) req.getSession().getAttribute("GoogleDrive-token");

        if (accessToken != null && !"".equals(accessToken)) {

            GoogleDriveResource gdResource = new GoogleDriveResource(accessToken);
            Files files = gdResource.getFiles();

            if (files != null) {
                req.setAttribute("files", files);
                req.getRequestDispatcher("/googleDriveFileListing.jsp").forward(req, resp);
            } else {
                log.info("The files returned are null... probably your token has experied. Redirecting to OAuth servlet.");
                req.getRequestDispatcher("/AuthController/GoogleDrive").forward(req, resp);
            }
        } else {
            log.info("Trying to access Google Drive without an access token, redirecting to OAuth servlet");
            req.getRequestDispatcher("/AuthController/GoogleDrive").forward(req, resp);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
