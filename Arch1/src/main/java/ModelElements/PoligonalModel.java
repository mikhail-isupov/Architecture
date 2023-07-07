package ModelElements;
import java.util.List;
public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures){
        poligons.add(new Poligon()); // объекты Poligon создаются внутри модели
        this.textures = textures; // а текстуры берутся извне
    }
}
