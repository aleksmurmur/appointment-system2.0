package org.aleksmurmur.appointmentsystem.common.jpa


import org.aleksmurmur.appointmentsystem.exception.EntityNotPersistedException
import java.io.Serializable

abstract class JpaPersistable<T : Serializable> {

    abstract var id: T?
        protected set

    val persistentId: T
        get() = id ?: throw EntityNotPersistedException("The entity hasn't persisted yet.")

}