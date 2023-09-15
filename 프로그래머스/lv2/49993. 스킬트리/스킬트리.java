class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        int idx = 0;
        for(String skill_tree : skill_trees) {
            boolean possible = true;
            for(int i = 0; i < skill_tree.length(); i++) {
                if(!skill.contains(skill_tree.substring(i, i+1))) {
                    continue;
                }
                if(idx >= skill.length()) { break; }
                
                char cur_skill = skill_tree.charAt(i);
                if(cur_skill != skill.charAt(idx)) {
                    possible = false;
                    break;
                }
                idx++;
            }
            if(possible) { answer++; }
            idx = 0;
        }
        return answer;
    }
}