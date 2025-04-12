package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String flavor;
    private boolean border;
    ArrayList<String> ingredients;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Pizza(String flavor, boolean border, ArrayList<String> ingredients) {
        this.flavor = flavor;
        this.border = border;
        this.ingredients = ingredients;

    }
}
