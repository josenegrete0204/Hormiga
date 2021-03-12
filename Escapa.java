public function Escapa() :void {
    velocity = new Vector3D(Game.instance.leaf.x - position.x, Game.instance.leaf.y - position.y); 
    if (distance(Game.instance.leaf, this) <= 12) {

        brain.setState(Casa);
    }
    if (distance(Game.mouse, this) <= MOUSE_THREAT_RADIUS) {
        brain.setState(Escapa);
    }
}