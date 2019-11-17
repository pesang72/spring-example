package du.study.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import du.study.common.exception.CommonException;
import du.study.common.exception.InvalidParameterException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionResolver extends AbstractHandlerExceptionResolver {
    private static final Gson gson = new GsonBuilder().create();

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            if (ex instanceof CommonException) {
                ex = (CommonException)ex;
                setResponse(response,(CommonException)ex);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ModelAndView();
    }

    private void setResponse( HttpServletResponse response,CommonException err) throws IOException {
        response.setStatus(err.getErrorType().getStatus());
        response.setHeader("Content-Type","application/json; charset=utf-8");
        PrintWriter writer = null;
        writer = response.getWriter();
        writer.write(gson.toJson(createErrorBody(err)));
        writer.flush();
        writer.close();
    }



    public static class ErrorBody{
        private Integer code;
        private String msg;
        private String cause;

        public ErrorBody(Integer code, String msg, String cause) {
            this.code = code;
            this.msg = msg;
            this.cause = cause;
        }
    }

    public static ErrorBody createErrorBody(CommonException err){
        return new ErrorBody(err.getErrorType().getErrorCode(),err.getErrorType().getErrorMsg(),err.getCauseMsg());
    }

}

