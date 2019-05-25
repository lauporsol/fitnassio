package aiss.controller1;

import aiss.model.google.drive.FileItem;
import aiss.controller1.GoogleDriveResource;
import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoogleDriveFileUpdateController extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(GoogleDriveFileDeleteController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String id = req.getParameter("id");
        if (id != null && !"".equals(id)) {
            String accessToken = (String) req.getSession().getAttribute("GoogleDrive-token");
            if (accessToken != null && !"".equals(accessToken)) {
                GoogleDriveResource gdResource = new GoogleDriveResource(accessToken);
                FileItem file = gdResource.getFile(id);
                req.setAttribute("file", file);
                req.setAttribute("content", gdResource.getFileContent(file));
                req.getRequestDispatcher("/googleDriveFileEdit.jsp").forward(req, resp);
            } else {
                log.info("Trying to access Google Drive without an access token, redirecting to OAuth servlet");
                req.getRequestDispatcher("/AuthController/GoogleDrive").forward(req, resp);
            }
        } else {
            log.warning("Invalid id for update!");
            req.getRequestDispatcher("/googleDriveFileList").forward(req, resp);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String id = req.getParameter("id");
        if (id != null && !"".equals(id)) {
            String accessToken = (String) req.getSession().getAttribute("GoogleDrive-token");
            String content = req.getParameter("content");
            if (accessToken != null && !"".equals(accessToken)) {
                GoogleDriveResource gdResource = new GoogleDriveResource(accessToken);
                gdResource.updateFileContent(id, content);
                req.getRequestDispatcher("/googleDriveFileList").forward(req, resp);
            } else {
                log.info("Trying to access Google Drive without an access token, redirecting to OAuth servlet");
                req.getRequestDispatcher("/AuthController/GoogleDrive").forward(req, resp);
            }
        } else {
            log.warning("Invalid id for update!");
            req.getRequestDispatcher("/googleDriveFileList").forward(req, resp);
        }
    }
}
