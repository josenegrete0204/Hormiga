public function escapar() :void {
    velocity = new Vector3D(position.x - Game.mouse.x, position.y - Game.mouse.y);
    if (distance(Game.mouse, this) > MOUSE_THREAT_RADIUS) {
        brain.setState(buscar);
    }
}