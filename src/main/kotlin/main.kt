fun main (){
    val myPost = Post(id = 1,
            ownerId = 1,
            formId = 1,
            date = 1610312400,
            text = "My first post. On my own Wall",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            attachment = arrayOf<Attachment>(AudioAttachment ("audio", Audio ())),
            canDelete = true,
            canEdit = true

    )
    val notMyPost1 = Post(id = 2,
            ownerId = 2,
            formId = 2,
            date = 1610312400,
            text = "Smbd's else post",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            attachment = arrayOf<Attachment>(VideoAttachment ("video", Video ())),
            canDelete = false,
            canEdit = false
    )

    val notMyPost2 = Post(id = 3,
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


    WallService.add(myPost)
    WallService.add(notMyPost1)
    WallService.add(notMyPost2)
    WallService.update(notMyPost21)

    WallService.printWall()


}