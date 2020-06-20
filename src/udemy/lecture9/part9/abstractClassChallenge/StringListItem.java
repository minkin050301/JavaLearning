package udemy.lecture9.part9.abstractClassChallenge;

public class StringListItem extends ListItem {
    public StringListItem(String value) {
        super(value);
    }

    @Override
    public int compareTo(ListItem listItem) {
        return compareStrings((String) this.getValue(), (String) listItem.getValue());
    }

    @Override
    public String toString() {
        return (String) getValue();
    }

    // the method compares two strings lexicographically, returns 0 if they are equal, a positive value if the first
    // string is greater than (i.e. comes after) the second one, and a negative value if vice versa
    private int compareStrings(String str1, String str2) {
        // calculate which string is shorter and save its length
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        // compare characters of the strings on the same position and return their difference if they're not equal
        for (int i = 0; i < minLength; i++) {
            int str1Ch = str1.charAt(i);
            int str2Ch = str2.charAt(i);

            if (str1Ch != str2Ch) {
                return str1Ch - str2Ch;
            }
        }

        // in case all characters are equal, return the difference of the lengths of the strings (in case the lengths
        // are different), otherwise return 0 since the strings are equal
        if (length1 != length2) {
            return length1 - length2;
        } else {
            return 0;
        }
    }
}
