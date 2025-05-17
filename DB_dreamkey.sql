-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DB_DreamKey
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DB_DreamKey` DEFAULT CHARACTER SET utf8 ;
USE `DB_DreamKey` ;

-- -----------------------------------------------------
-- Table `DB_DreamKey`.`Membresias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_DreamKey`.`Membresias` (
  `idMembresias` INT NOT NULL AUTO_INCREMENT,
  `nombreMembresia` VARCHAR(45) NOT NULL,
  `precioMembresia` DOUBLE UNSIGNED NOT NULL,
  `categoriaMembresia` VARCHAR(45) NOT NULL,
  `urlImagenMembresia` VARCHAR(120) NOT NULL,
  `descripcionMembresia` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`idMembresias`),
  UNIQUE INDEX `nombreMembresia_UNIQUE` (`nombreMembresia` ASC) VISIBLE,
  UNIQUE INDEX `urlImagenMembresia_UNIQUE` (`urlImagenMembresia` ASC) VISIBLE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `DB_DreamKey`.`Suscripcion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_DreamKey`.`Suscripcion` (
  `idSuscripcion` INT NOT NULL AUTO_INCREMENT,
  `fechaSuscripcion` DATE NOT NULL,
  `fechaPagoSuscripcion` DATE NOT NULL,
  `activaSuscripcion` TINYINT NOT NULL,
  `Membresias_idMembresias` INT NOT NULL,
  PRIMARY KEY (`idSuscripcion`),
  INDEX `fk_Suscripcion_Membresias1_idx` (`Membresias_idMembresias` ASC) VISIBLE,
  CONSTRAINT `fk_Suscripcion_Membresias1`
    FOREIGN KEY (`Membresias_idMembresias`)
    REFERENCES `DB_DreamKey`.`Membresias` (`idMembresias`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `DB_DreamKey`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_DreamKey`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `nombrePerfilUsuario` VARCHAR(60) NOT NULL,
  `telefonoUsuario` VARCHAR(10) NOT NULL,
  `correoUsuario` VARCHAR(45) NOT NULL,
  `contraseñaUsuario` VARCHAR(45) NOT NULL,
  `fechaPagoSuscripcionUsuario` DATE NOT NULL,
  `Suscripcion_idSuscripcion` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE INDEX `correoUsuario_UNIQUE` (`correoUsuario` ASC) VISIBLE,
  UNIQUE INDEX `nombrePerfilUsuario_UNIQUE` (`nombrePerfilUsuario` ASC) VISIBLE,
  UNIQUE INDEX `telefonoUsuario_UNIQUE` (`telefonoUsuario` ASC) VISIBLE,
  INDEX `fk_Usuario_Suscripcion1_idx` (`Suscripcion_idSuscripcion` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_Suscripcion1`
    FOREIGN KEY (`Suscripcion_idSuscripcion`)
    REFERENCES `DB_DreamKey`.`Suscripcion` (`idSuscripcion`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `DB_DreamKey`.`Afiliados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_DreamKey`.`Afiliados` (
  `idAfiliados` INT NOT NULL AUTO_INCREMENT,
  `nombreAfiliados` VARCHAR(45) NOT NULL,
  `imgAfiliados` VARCHAR(120) NOT NULL,
  `descripcionAfiliados` VARCHAR(200) NOT NULL,
  `ratingAfiliados` INT NOT NULL,
  `detallesAfiliados` VARCHAR(200) NOT NULL,
  `serviciosAfiliados1` VARCHAR(15) NOT NULL,
  `serviciosAfiliados2` VARCHAR(15) NULL,
  `serviciosAfiliados3` VARCHAR(15) NULL,
  `imgServiciosAfiliados1` VARCHAR(90) NULL,
  `imgServiciosAfiliados2` VARCHAR(90) NULL,
  `imgServiciosAfiliados3` VARCHAR(90) NULL,
  `Membresias_idMembresias` INT NOT NULL,
  PRIMARY KEY (`idAfiliados`),
  INDEX `fk_Afiliados_Membresias1_idx` (`Membresias_idMembresias` ASC) VISIBLE,
  CONSTRAINT `fk_Afiliados_Membresias1`
    FOREIGN KEY (`Membresias_idMembresias`)
    REFERENCES `DB_DreamKey`.`Membresias` (`idMembresias`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `DB_DreamKey`.`Comentario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_DreamKey`.`Comentario` (
  `idComentario` INT NOT NULL AUTO_INCREMENT,
  `comentarioComentario` VARCHAR(150) NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idComentario`),
  INDEX `fk_Comentario_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Comentario_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `DB_DreamKey`.`Usuario` (`idUsuario`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
