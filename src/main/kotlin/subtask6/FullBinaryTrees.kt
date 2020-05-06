package subtask6

class FullBinaryTrees {

    fun stringForNodeCount(count: Int): String {
        if(count==1) return "[[0]]"
        if(count%2==0) return "[]"
        var result ="["
        for (c: String in getList("[0", count-1, 0)) {
            result+=c
        }
        result+="]"
        return result
    }
    private fun getList(root: String, v: Int, node: Int): ArrayList<String>{
        if (v==0) return arrayListOf("$root]")
        else {
            val array: ArrayList<String> = getList("$root,0,0", v - 2, node+1)
            if (node>0) {
                array.addAll(getList("$root,null,null", v, node-1))
            }
            return array
        }
    }
}
