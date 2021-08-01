package niyulu_service;

public class ServiceReponse {
    private String selfIntro;

    public String getSelfIntro() {
        return selfIntro;
    }

    public void setSelfIntro(String selfIntro) {
        this.selfIntro = selfIntro;
    }

    @Override
    public String toString() {
        return "ServiceReponse{" +
                "selfIntro='" + selfIntro + '\'' +
                '}';
    }
}
