import niyulu_service.NylService;
import niyulu_service.ServiceReponse;
import niyulu_service.ServiceRequest;

public class StrategyMain implements NylService {
    @Override
    public ServiceReponse service(ServiceRequest request) {
        ServiceReponse reponse = new ServiceReponse();
        String ret = "我叫: " + request.getName() + " , 今年: " + request.getAge() + " 岁了. ";
        reponse.setSelfIntro(ret);
        return reponse;
    }
}
