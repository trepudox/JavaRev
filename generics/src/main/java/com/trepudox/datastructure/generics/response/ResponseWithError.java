package com.trepudox.datastructure.generics.response;

public class ResponseWithError<T> {
   
    private T data;
    private ErrorRev errorRev;

    public ResponseWithError(T data, ErrorRev errorRev) {
        this.data = data;
        this.errorRev = errorRev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ErrorRev getError() {
        return errorRev;
    }

    public void setError(ErrorRev errorRev) {
        this.errorRev = errorRev;
    }

    @Override
    public String toString() {
        return "ResponseWithError{" +
                "data=" + data +
                ", error=" + errorRev +
                '}';
    }
}
