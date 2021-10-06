package skiers;

import com.google.gson.Gson;
import util.MessageResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/skiers/*")
public class SkierServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write(request.getPathInfo());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] urlPathList = request.getPathInfo().split("/");
        if (!isSkierPostUrlValid(urlPathList)) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            String responseJSON = new Gson().toJson(new MessageResponse("The URL path is invalid"));
            response.getWriter().write(responseJSON);
            return;
        }

        try {
            int resortID = Integer.parseInt(urlPathList[1]);
            int season = Integer.parseInt(urlPathList[3]);
            int day = Integer.parseInt(urlPathList[5]);
            int skierID = Integer.parseInt(urlPathList[7]);

            response.setStatus(HttpServletResponse.SC_OK);
            String responseJSON = new Gson().toJson(new MessageResponse("The new record to resort:" + resortID + " season:" + season
            + ", day:" + day + " skier:" + skierID + " has been created"));
            response.getWriter().write(responseJSON);
        } catch (NumberFormatException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            String responseJSON = new Gson().toJson(new MessageResponse("The given parameters are invalid"));
            response.getWriter().write(responseJSON);
        }
    }

    private boolean isSkierPostUrlValid(String[] urlPathList) {
        if (urlPathList.length != 8) {
            return false;
        }

        return urlPathList[2].equals("seasons") && urlPathList[4].equals("days")
            && urlPathList[6].equals("skiers");
    }
}
