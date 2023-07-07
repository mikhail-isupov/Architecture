package ModelElements;
import java.util.ArrayList;
import java.util.List;
public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Camera> cameras;
    public List<Flash> flashes;
    public Scene(PoligonalModel model, Camera camera){
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.models.add(model);
        this.cameras.add(camera);
    }
    public void addFlash(Flash flash){
        this.flashes.add(flash); // Объект данных Scene аггрегирует данные
    }

    public void addCameraAndModel(PoligonalModel model, Camera camera){
        this.models.add(model);
        this.cameras.add(camera);
    }

}
