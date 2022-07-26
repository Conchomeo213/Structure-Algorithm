package BAI_KIEM_TRA;

import java.util.HashSet;
import java.util.Set;

public class _929UniqueEmailAddresses {
    public static int numUniqueEmails(String[] emails) {
        Set<String> Emails = new HashSet<>();

        for (String email : emails){
            int split_position = email.indexOf("@");
            String local_name = email.substring(0,split_position);
            String domain_name = email.substring(split_position);

            if (local_name.contains("+")){
                int plus_position = local_name.indexOf("+");
                local_name = local_name.substring(0,plus_position);
            }
            local_name = local_name.replaceAll("\\.","");
            String new_email = local_name + domain_name;
            Emails.add(new_email);
        }
        return Emails.size();
    }

    public static void main(String[] args) {
        String[] s ={"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(s));
    }
}
