package com.expense_tracker.expense_tracker.exception.allException;

public class ApiResponse {
    private String message;
    private boolean success;
    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
