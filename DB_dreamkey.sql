-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_dreamkey
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_dreamkey
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_dreamkey` DEFAULT CHARACTER SET utf8 ;
USE `db_dreamkey` ;

-- -----------------------------------------------------
-- Table `db_dreamkey`.`Afiliados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dreamkey`.`Afiliados` (
  `idAfiliados` INT NOT NULL AUTO_INCREMENT,
  `nombreAfiliados` VARCHAR(45) NOT NULL,
  `imgAfiliados` VARCHAR(120) NOT NULL,
  `descripcionAfiliados` VARCHAR(200) NOT NULL,
  `ratingAfiliados` DOUBLE UNSIGNED NOT NULL,
  `detallesAfiliados` VARCHAR(200) NOT NULL,
  `serviciosAfiliados1` VARCHAR(15) NOT NULL,
  `serviciosAfiliados2` VARCHAR(15) NOT NULL,
  `serviciosAfiliados3` VARCHAR(15) NOT NULL,
  `imgAfiliados1` VARCHAR(120) NOT NULL,
  `imgAfiliados2` VARCHAR(120) NOT NULL,
  `imgAfiliados3` VARCHAR(120) NOT NULL,
  PRIMARY KEY (`idAfiliados`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_dreamkey`.`Membresias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dreamkey`.`Membresias` (
  `idMembresias` INT NOT NULL AUTO_INCREMENT,
  `nombreMembresias` VARCHAR(45) NOT NULL,
  `precioMembresia` DOUBLE UNSIGNED NOT NULL,
  `categoriaMembresia` VARCHAR(45) NOT NULL,
  `urlImagenMembresia` VARCHAR(120) NOT NULL,
  `descripcionMembresia` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`idMembresias`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_dreamkey`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dreamkey`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `nombreUsuario` VARCHAR(60) NOT NULL,
  `telefonoUsuario` VARCHAR(30) NOT NULL,
  `correoUsuario` VARCHAR(45) NOT NULL,
  `contraseñaUsuario` VARCHAR(1000) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_dreamkey`.`Suscripcion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dreamkey`.`Suscripcion` (
  `idSuscripcion` INT NOT NULL AUTO_INCREMENT,
  `fechaSuscripcion` DATE NOT NULL,
  `fechaPagoSuscripcion` DATE NOT NULL,
  `suscripcionActiva` TINYINT NOT NULL,
  `idMembresias_fk` INT NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idSuscripcion`),
  INDEX `fk_Suscripcion_Membresias1_idx` (`idMembresias_fk` ASC) VISIBLE,
  INDEX `fk_Suscripcion_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Suscripcion_Membresias1`
    FOREIGN KEY (`idMembresias_fk`)
    REFERENCES `db_dreamkey`.`Membresias` (`idMembresias`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Suscripcion_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `db_dreamkey`.`Usuario` (`idUsuario`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_dreamkey`.`Comentario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dreamkey`.`Comentario` (
  `idComentario` INT NOT NULL AUTO_INCREMENT,
  `comentarioComentario` VARCHAR(200) NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idComentario`),
  INDEX `fk_Comentario_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Comentario_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `db_dreamkey`.`Usuario` (`idUsuario`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_dreamkey`.`Afiliados_has_Membresias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dreamkey`.`Afiliados_has_Membresias` (
  `Afiliados_idAfiliados` INT NOT NULL,
  `Membresias_idMembresias` INT NOT NULL,
  PRIMARY KEY (`Afiliados_idAfiliados`, `Membresias_idMembresias`),
  INDEX `fk_Afiliados_has_Membresias_Membresias1_idx` (`Membresias_idMembresias` ASC) VISIBLE,
  INDEX `fk_Afiliados_has_Membresias_Afiliados1_idx` (`Afiliados_idAfiliados` ASC) VISIBLE,
  CONSTRAINT `fk_Afiliados_has_Membresias_Afiliados1`
    FOREIGN KEY (`Afiliados_idAfiliados`)
    REFERENCES `db_dreamkey`.`Afiliados` (`idAfiliados`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Afiliados_has_Membresias_Membresias1`
    FOREIGN KEY (`Membresias_idMembresias`)
    REFERENCES `db_dreamkey`.`Membresias` (`idMembresias`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
