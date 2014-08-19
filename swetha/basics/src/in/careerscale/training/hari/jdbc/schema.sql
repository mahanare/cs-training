SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `office` ;
CREATE SCHEMA IF NOT EXISTS `office` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `office` ;

-- -----------------------------------------------------
-- Table `department`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `department` ;

CREATE TABLE IF NOT EXISTS `department` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `designation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `designation` ;

CREATE TABLE IF NOT EXISTS `designation` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `employee` ;

CREATE TABLE IF NOT EXISTS `employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `designation_id` INT NULL,
  `department_id` INT NULL,
  `manager_id` INT NULL,
  `user_name` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_employee_department_id_idx` (`department_id` ASC),
  INDEX `fk_employee_designation_id_idx` (`designation_id` ASC),
  INDEX `fk_employee_manager_id_idx` (`manager_id` ASC),
  CONSTRAINT `fk_employee_department_id`
    FOREIGN KEY (`department_id`)
    REFERENCES `department` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employee_designation_id`
    FOREIGN KEY (`designation_id`)
    REFERENCES `designation` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employee_manager_id`
    FOREIGN KEY (`manager_id`)
    REFERENCES `employee` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `department`
-- -----------------------------------------------------
START TRANSACTION;
USE `office`;
INSERT INTO `department` (`id`, `name`) VALUES (1, 'Development');
INSERT INTO `department` (`id`, `name`) VALUES (2, 'QA');
INSERT INTO `department` (`id`, `name`) VALUES (3, 'HR');
INSERT INTO `department` (`id`, `name`) VALUES (4, 'Finance');

COMMIT;


-- -----------------------------------------------------
-- Data for table `designation`
-- -----------------------------------------------------
START TRANSACTION;
USE `office`;
INSERT INTO `designation` (`id`, `name`) VALUES (1, 'Developer');
INSERT INTO `designation` (`id`, `name`) VALUES (2, 'Tester');
INSERT INTO `designation` (`id`, `name`) VALUES (3, 'Dev Manager');
INSERT INTO `designation` (`id`, `name`) VALUES (4, 'QA Manager');

COMMIT;


-- -----------------------------------------------------
-- Data for table `employee`
-- -----------------------------------------------------
START TRANSACTION;
USE `office`;
INSERT INTO `employee` (`id`, `first_name`, `last_name`, `designation_id`, `department_id`, `manager_id`, `user_name`, `password`) VALUES (1, 'Swetha', 'G', 3, 1, NULL, NULL, NULL);
INSERT INTO `employee` (`id`, `first_name`, `last_name`, `designation_id`, `department_id`, `manager_id`, `user_name`, `password`) VALUES (2, 'Ambika', NULL, 1, 1, 1, NULL, NULL);
INSERT INTO `employee` (`id`, `first_name`, `last_name`, `designation_id`, `department_id`, `manager_id`, `user_name`, `password`) VALUES (3, 'hari', 'Mallepally', 1, 1, NULL, 'hari', 'password');
INSERT INTO `employee` (`id`, `first_name`, `last_name`, `designation_id`, `department_id`, `manager_id`, `user_name`, `password`) VALUES (4, 'raji', NULL, 2, 2, 3, 'raji', 'password');

COMMIT;

