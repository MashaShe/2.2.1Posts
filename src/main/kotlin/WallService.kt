class WallService (
    var posts: Array<Post> = emptyArray<Post>()
) {

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            posts += post
        }
        else{
        val lastIndex = posts.size - 1
        post.id = posts[lastIndex].nextId
        posts += post}
        return post
    }

    fun update(post: Post): Boolean {
        var ret: Boolean = false
        posts.forEachIndexed { index, Post ->
            if (post.id == posts[index].id) {
               val target = post.copy(ownerId = posts[index].ownerId, date = posts[index].date)
                posts[index] = target
                ret = true
            }
        }
        return ret
    }

    fun printWall(){
        posts.forEachIndexed { index, post ->
            println("${posts[index].ownerId} пишет: ${posts[index].text}, id записи - ${posts[index].id} \n")
            }
    }

    operator fun get(i: Int): Post {
        return posts[i]

    }
}
