public class jugador
{
    public var position   :Vector3D;
    public var velocity   :Vector3D;
    public var brain      :estadofinito;
 
    public function Hormiga(posX :Number, posY :Number) {
        position    = new Vector3D(posX, posY);
        velocity    = new Vector3D( -1, -1);
        brain       = new estadofinito();
 
        brain.setState(buscar);
    }
 
    public function buscar() :void {
    }
    public function hogar() :void {
    }
 
    public function Escapa() :void {
    }
 
    public function cargar():void {

        moveBasedOnVelocity();
    }
 
}