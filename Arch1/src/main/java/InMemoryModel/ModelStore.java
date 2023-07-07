package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    private IModelChangedObserver changedObserver;
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    public List<Texture> textures;

    /**
     * Объект данных ModelStore осуществляет внутри себя композицию объектов PoligonalModel, Flash, Scene, Camera
     *
     */

    public ModelStore(){
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        PoligonalModel newModel = new PoligonalModel(textures);
        Point3D point3d = new Point3D(0, 0, 0);
        Angle3D angle = new Angle3D();
        Color color = new Color(0, 0, 0);
        Camera camera = new Camera(point3d, angle);
        this.models.add(newModel);
        this.flashes.add(new Flash(point3d, angle, color , 1));
        this.cameras.add(camera);
        this.scenes.add(new Scene(newModel, camera));
    }

    public void notifyChange(IModelChanger sender){
        //Реализация интерфейса
    }

    public Scene getScene(int scene){
        return scenes.get(scene);
    }

}
