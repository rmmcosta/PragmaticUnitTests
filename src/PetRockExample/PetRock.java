package PetRockExample;

public class PetRock
{
    private String _name;
    private boolean _isHappy = false;

    public PetRock(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    public boolean isHappy() {
        return _isHappy;
    }

    public void play() {
        _isHappy = true;
    }
}
