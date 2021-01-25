import java.lang.RuntimeException

object WallService{

    var posts: Array<Post> = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            posts += post
        }
        else{
        post.id = posts.last().id + 1
        posts += post
        }
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

    fun createComment(comment: Comment) {
        var ret: Boolean = false
        posts.forEachIndexed { index, Post ->
            if (comment.postId == posts[index].id) {
                if (comments.isEmpty()) {
                    comments += comment
                }
                else{
                    //val commentsIndex: Int = comments.lastIndex + 1
                    comment.id = comments.lastIndex + 1
                    comments+= comment
                }
                ret = true
            }

    }
       // try {
            if (ret) {
                println(" everything is ok with this comment")
            } else throw PostNotFoundException("no post with id: ${comment.postId}")
        //}
      //  catch (e: RuntimeException) {
       //     println("Произошла ошибка при добавлении комментария. Возможно пост удален")
       // }

}
class PostNotFoundException(message: String): RuntimeException(message) {

}
}

//    operator fun get(i: Int): Post {
//        return posts[i]
//
//    }
