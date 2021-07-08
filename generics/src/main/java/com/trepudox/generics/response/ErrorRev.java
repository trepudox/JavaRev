package com.trepudox.generics.response;

public class ErrorRev {
    private String mensagem;
    private String status;

    public ErrorRev(String mensagem, String status) {
        this.mensagem = mensagem;
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Error{" +
                "mensagem='" + mensagem + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
