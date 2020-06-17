package com.rawatJi;

public class ResponseMessages {


    enum httpResponseMessage{

        BadRequest(400, "Page Not Found"),
        UnAuthorized(401, "UnAuthorized"),
        Forbidden(403, "Page denied"),
        NotFound(404, "Page Not Found"),
        UpdatedSuccessfully(200, "Updated");

        int code;
        String message;


        httpResponseMessage(int code,String message)
        {

            this.code=code;
            this.message=message;

        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }

}
