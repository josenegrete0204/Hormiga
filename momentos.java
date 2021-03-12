public class estadofinito {
    private var active :Function;
   
      public function estadofinito() {
      }
   
      public function setState(state :Function) :void {
          active = state;
      }
   
      public function cargar() :void {
          if (active != null) {
              active();
          }
      }
  }