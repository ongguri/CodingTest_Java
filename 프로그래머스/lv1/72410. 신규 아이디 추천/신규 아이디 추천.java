class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
        String new_id_step = "";
        
        // 1. 대문자는 소문자로
        new_id_step = swapLowserCase(new_id, sb);
        
        // 2. -, _, . 를 제외한 모든 특수문자 제거
        new_id_step = removeSpecialCharacters(new_id_step, sb);
        
        // 3. 마침표는 하나로 치환
        new_id_step = dotCountChangetoOne(new_id_step);
        
        // 4. 처음이나 끝에 마침표는 제거
        new_id_step = firstOrEndDotRemove(new_id_step, sb);
        
        // 5. 빈 문자열이면 "a" 대입
        if(new_id_step.length() == 0) {
            new_id_step = isEmptyStringAddA(new_id_step);
        }
        
        // 6. 16자 이상이면 15자에서 자르기. 자른 후 마침표 주의
        if(new_id_step.length() >= 16) {
            new_id_step = sliceStringLength(new_id_step);
            new_id_step = firstOrEndDotRemove(new_id_step, sb);
        }
        
        // 7. 2자 이하라면 new_id의 마지막 문자가 길이 3이 될때까지 반복
        if(new_id_step.length() <= 2) {
            new_id_step = repeatStringTillLengthThree(new_id_step, sb);
        }
        
        return new_id_step;
    }
    
    public String swapLowserCase(String new_id, StringBuilder sb) {
        String result;
        
        for(int s = 0; s < new_id.length(); s++) {
            if(Character.isUpperCase(new_id.charAt(s))) {
                sb.append(Character.toLowerCase(new_id.charAt(s)));
                continue;
            }
            sb.append(new_id.charAt(s));
        }
        
        result = sb.toString();
        sb.setLength(0);
        
        return result;
    } 
    
    public String removeSpecialCharacters(String new_id, StringBuilder sb) {
        String result;
        
        for(int s = 0; s < new_id.length(); s++) {
            if(new_id.substring(s, s+1).matches("[-|_|.a-z0-9]")) {
                sb.append(new_id.charAt(s));
            }
        }
        
        result = sb.toString();
        sb.setLength(0);
        
        return result;
    }
    
    public String dotCountChangetoOne(String new_id) {
        return new_id.replaceAll("[.]+", ".");
    }
    
    public String firstOrEndDotRemove(String new_id, StringBuilder sb) {
        String result;
        
        for(int s = 0; s < new_id.length(); s++) {
            if((s == 0 || s == new_id.length()-1) && new_id.charAt(s) == '.') {
                continue;
            }
            sb.append(new_id.charAt(s));
        }
        
        result = sb.toString();
        sb.setLength(0);
        
        return result;
    }
    
    public String isEmptyStringAddA(String new_id) {
        return "a";
    }
    
    public String sliceStringLength(String new_id) {
        return new_id.substring(0, 15);
    }
    
    public String repeatStringTillLengthThree(String new_id, StringBuilder sb) {
        char lastStr = new_id.charAt(new_id.length()-1);
        String result = "";
        sb.append(new_id);
        
        while(sb.length() != 3) {
            sb.append(lastStr);
        }
        
        result = sb.toString();
        sb.setLength(0);
        
        return result;
    }
}