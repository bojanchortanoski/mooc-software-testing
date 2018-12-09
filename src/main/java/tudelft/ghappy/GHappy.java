package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;

        if (!str.contains("g")) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {

            if(Character.toLowerCase(str.charAt(i)) == 'g') {
                if (i - 1 >= 0 && Character.toLowerCase(str.charAt(i - 1)) == 'g') {
                    continue;
                }
                if (i+1 < str.length() && Character.toLowerCase(str.charAt(i + 1)) == 'g') {
                    continue;
                }
                return false;
            }
        }

        return true;

    }
}
