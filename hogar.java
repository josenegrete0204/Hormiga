public function hogar() :void {
   velocity = new Vector3D(Game.instance.hogar.x - position.x, Game.instance.hogar.y - position.y);
    if (distance(Game.instance.hogar, this) <= 12) {
        brain.setState(buscar);
    }
}
