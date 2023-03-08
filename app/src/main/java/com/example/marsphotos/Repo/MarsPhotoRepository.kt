package com.example.marsphotos.Repo

import com.example.marsphotos.Network.MarsApi
import com.example.marsphotos.Network.MarsPhoto

interface MarsPhotoRepository {

suspend fun getMarsPhotos(): List<MarsPhoto>

}

class DefaultMarsPhotosRepository: MarsPhotoRepository{
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return MarsApi.retrofitService.getPhotos()
    }

}