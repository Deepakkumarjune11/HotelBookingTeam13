package com.example.booking


import com.example.booking.data.*
import retrofit2.Call

import retrofit2.http.*

interface HttpApiService {

   @GET("hotels")
   suspend fun getHotels(): ResponseHotel

   @POST("login")
   suspend fun login(@Body userMin: UserMin): User

   @POST("register")
   suspend fun register(@Body userMin: UserMin)

   @DELETE("users/me")
   suspend fun deleteUser()

   @DELETE("users/me/reservations/{reservationId}")
   suspend fun deleteReservation(@Path("reservationId") id: Int)

   @GET("users/me/reservations")
   suspend fun getReservations(): ResponseReservation

   @POST("users/me/reservations")
   suspend fun createReservation(@Body reserv: ReservationMin)

   @POST("users/me/email")
   suspend fun changeEmail(@Body email: UserEmail)

   @GET("users/me/loginHistory")
   suspend fun getLoginHistory(): ResponseLoginHistory

   @GET("users")
   suspend fun getLocalUsers(): ResponseLocalUser

}