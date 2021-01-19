fun main (){
    val myPost = Post(id = 1,
            nextId = 2,
            ownerId = 1,
            formId = 1,
            date = 1610312400,
            text = "My first post. On my own Wall",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = true,
            canEdit = true
    )
    val notMyPost1 = Post(id = 2,
            nextId = 3,
            ownerId = 2,
            formId = 2,
            date = 1610312400,
            text = "Smbd's else post",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = false,
            canEdit = false
    )

    val notMyPost2 = Post(id = 3,
            nextId = 4,
            ownerId = 3,
            formId = 3,
            date = 1610312400,
            text = "Smbd's else post",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = false,
            canEdit = false
    )
    val notMyPost21 = Post(id = 3,
            nextId = 4,
            ownerId = 7,
            formId = 3,
            date = 1610312400,
            text = "Smbd's else post. Updated!",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = false,
            canEdit = false
    )

    var posts = WallService()
    posts.add(myPost)
    posts.add(notMyPost1)
    posts.add(notMyPost2)
    posts.update(notMyPost21)

    posts.printWall()


}