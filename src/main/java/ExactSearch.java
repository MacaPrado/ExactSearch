public class ExactSearch {

    public static int indexOf(char[] query, char[] target){
        boolean found = false;
        int index = -1;
        for(int i=0; i<=target.length-query.length; i++){
            for(int j=0; j<query.length; j++){
                if (query[j] != target[i+j]) {
                    found = false;
                    break;
                }
                found = true;
            }
            if(found){
                index = i;
                break;
            }
        }
        return index;
    }

    public int indexOf2(char[] query, char[] target){
        int idxTarget = 0;
        int idxQuery = 0;

        while(idxTarget < target.length && idxQuery < query.length){
            if(query[idxQuery] == target[idxTarget]){
                idxQuery++;
                idxTarget++;
            }
            else{
                idxTarget = idxTarget - idxQuery -1;
                idxQuery = 0;
            }
        }
        if(idxQuery == query.length){
            return idxTarget - idxQuery;
        }
        return -1;
    }

    public int indexOf3(char[] query, char[] target){
        int idxTarget = 0;
        int idxQuery = 0;

        while(idxTarget < target.length && idxQuery < query.length){
            if(query[idxQuery] == target[idxTarget]){
                idxQuery++;
                idxTarget++;
                if(idxQuery == query.length){
                    return idxTarget - idxQuery;
                }
            }
            else{
                idxTarget = idxTarget - idxQuery -1;
                idxQuery = 0;
            }
        }
        return -1;
    }
}

